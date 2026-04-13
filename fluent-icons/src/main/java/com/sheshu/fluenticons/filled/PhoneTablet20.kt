package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneTablet20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneTablet20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.804f)
            curveTo(4f, 3.794f, 4.84f, 3f, 5.845f, 3f)
            horizontalLineToRelative(10.31f)
            curveTo(17.16f, 3f, 18f, 3.793f, 18f, 4.804f)
            verticalLineToRelative(7.392f)
            curveTo(18f, 13.206f, 17.16f, 14f, 16.155f, 14f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 11f, 12.5f, 11f)
            horizontalLineTo(10f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            verticalLineTo(4.804f)
            close()
            moveTo(3.5f, 7f)
            curveTo(2.672f, 7f, 2f, 7.672f, 2f, 8.5f)
            verticalLineToRelative(8f)
            curveTo(2f, 17.328f, 2.672f, 18f, 3.5f, 18f)
            horizontalLineToRelative(4f)
            curveTo(8.328f, 18f, 9f, 17.328f, 9f, 16.5f)
            verticalLineToRelative(-8f)
            curveTo(9f, 7.672f, 8.328f, 7f, 7.5f, 7f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(1f, 8.5f)
            curveTo(4.5f, 15.224f, 4.724f, 15f, 5f, 15f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(6.276f, 16f, 6f, 16f)
            horizontalLineTo(5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
