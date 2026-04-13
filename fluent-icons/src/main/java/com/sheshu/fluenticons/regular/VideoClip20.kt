package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoClip20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoClip20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.765f, 7.076f)
            curveTo(8.611f, 6.98f, 8.417f, 6.975f, 8.258f, 7.063f)
            curveTo(8.098f, 7.15f, 8f, 7.318f, 8f, 7.5f)
            verticalLineToRelative(5.15f)
            curveToRelative(0f, 0.184f, 0.101f, 0.353f, 0.263f, 0.44f)
            curveToRelative(0.163f, 0.088f, 0.36f, 0.079f, 0.513f, -0.023f)
            lineToRelative(4f, -2.649f)
            curveToRelative(0.142f, -0.093f, 0.226f, -0.253f, 0.224f, -0.423f)
            curveToRelative(-0.002f, -0.17f, -0.09f, -0.327f, -0.235f, -0.417f)
            lineToRelative(-4f, -2.502f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(18f, 4.12f, 16.88f, 3f, 15.5f, 3f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(16.328f, 4f, 17f, 4.672f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.672f, 16f, 3f, 15.328f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            close()
        }
    }.build()
}
