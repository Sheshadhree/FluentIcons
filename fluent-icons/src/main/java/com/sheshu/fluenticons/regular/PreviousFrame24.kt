package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PreviousFrame24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PreviousFrame24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3.75f)
            curveTo(18.5f, 3.336f, 18.836f, 3f, 19.25f, 3f)
            curveTo(19.665f, 3f, 20f, 3.336f, 20f, 3.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.414f, -0.335f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveToRelative(-6.239f, -0.44f)
            curveToRelative(1.162f, -0.796f, 2.74f, 0.035f, 2.74f, 1.443f)
            verticalLineToRelative(14.495f)
            curveToRelative(0f, 1.413f, -1.59f, 2.244f, -2.75f, 1.437f)
            lineTo(1.753f, 13.383f)
            curveToRelative(-1.006f, -0.7f, -1f, -2.188f, 0.01f, -2.88f)
            lineTo(12.26f, 3.309f)
            close()
            moveToRelative(1.24f, 1.443f)
            curveToRelative(0f, -0.201f, -0.226f, -0.32f, -0.392f, -0.206f)
            lineTo(2.611f, 11.74f)
            curveToRelative(-0.145f, 0.1f, -0.145f, 0.312f, -0.002f, 0.412f)
            lineToRelative(10.499f, 7.301f)
            curveToRelative(0.165f, 0.116f, 0.392f, -0.003f, 0.392f, -0.205f)
            verticalLineTo(4.753f)
            close()
        }
    }.build()
}
