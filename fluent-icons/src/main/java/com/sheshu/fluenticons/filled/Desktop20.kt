package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desktop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desktop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(2f, 14.328f, 2.672f, 15f, 3.5f, 15f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 17f, 5f, 17.224f, 5f, 17.5f)
            reflectiveCurveTo(5.224f, 18f, 5.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 17f, 14.5f, 17f)
            horizontalLineTo(13f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-10f)
            curveTo(18f, 2.672f, 17.328f, 2f, 16.5f, 2f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(12f, 15f)
            verticalLineToRelative(2f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}
