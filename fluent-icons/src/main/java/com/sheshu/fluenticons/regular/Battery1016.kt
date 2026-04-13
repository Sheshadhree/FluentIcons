package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Battery1016: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Battery1016",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 6f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
            moveToRelative(9.5f, 0.5f)
            horizontalLineTo(14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.103f, -0.897f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.103f, 0f, -2f, -0.897f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.103f, 0.897f, -2f, 2f, -2f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.103f, 0f, 2f, 0.897f, 2f, 2f)
            verticalLineToRelative(0.5f)
            close()
            moveToRelative(-2f, 4.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(7.5f)
            close()
        }
    }.build()
}
