package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Video32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Video32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 6f)
            curveTo(4.015f, 6f, 2f, 8.015f, 2f, 10.5f)
            verticalLineToRelative(11f)
            curveTo(2f, 23.985f, 4.015f, 26f, 6.5f, 26f)
            horizontalLineToRelative(11f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-0.487f)
            lineToRelative(4.468f, 3.084f)
            curveToRelative(1.492f, 1.03f, 3.528f, -0.037f, 3.528f, -1.851f)
            verticalLineTo(9.754f)
            curveToRelative(0f, -1.814f, -2.036f, -2.882f, -3.528f, -1.852f)
            lineTo(22f, 10.987f)
            verticalLineTo(10.5f)
            curveTo(22f, 8.015f, 19.985f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(22f, 13.418f)
            lineToRelative(5.604f, -3.87f)
            curveToRelative(0.166f, -0.114f, 0.392f, 0.004f, 0.392f, 0.206f)
            verticalLineToRelative(12.492f)
            curveToRelative(0f, 0.201f, -0.226f, 0.32f, -0.392f, 0.206f)
            lineTo(22f, 18.582f)
            verticalLineToRelative(-5.165f)
            close()
            moveTo(4f, 10.5f)
            curveTo(4f, 9.12f, 5.12f, 8f, 6.5f, 8f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(5.12f, 24f, 4f, 22.88f, 4f, 21.5f)
            verticalLineToRelative(-11f)
            close()
        }
    }.build()
}
