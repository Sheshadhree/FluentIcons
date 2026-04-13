package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Battery1016: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Battery1016",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.103f, -0.897f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(2.897f, 4f, 2f, 4.897f, 2f, 6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.103f, 0.897f, 2f, 2f, 2f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.103f, 0f, 2f, -0.897f, 2f, -2f)
            verticalLineTo(9.5f)
            horizontalLineTo(14f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
            moveTo(12f, 10f)
            curveToRelative(0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4f)
            curveToRelative(-0.275f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(7.5f)
            curveTo(11.775f, 5.5f, 12f, 5.724f, 12f, 6f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
