package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BorderAll24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BorderAll24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(12f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(10f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(-2f, -6f)
            horizontalLineTo(5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(2f, -2f)
            horizontalLineToRelative(6f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(-2f, -6f)
            horizontalLineTo(6f)
            curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(6f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
