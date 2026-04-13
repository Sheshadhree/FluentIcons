package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TreeEvergreen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TreeEvergreen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.618f, 2.211f)
            curveToRelative(-0.363f, -0.287f, -0.875f, -0.287f, -1.238f, 0f)
            lineToRelative(-3.308f, 2.61f)
            curveTo(5.267f, 5.457f, 5.365f, 6.565f, 6.014f, 7.136f)
            lineTo(4.55f, 8.342f)
            curveToRelative(-0.963f, 0.794f, -0.573f, 2.271f, 0.51f, 2.594f)
            lineToRelative(-1.586f, 1.486f)
            curveToRelative(-0.986f, 0.923f, -0.332f, 2.577f, 1.019f, 2.577f)
            horizontalLineToRelative(3.505f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(3.504f)
            curveToRelative(1.351f, 0f, 2.005f, -1.655f, 1.018f, -2.578f)
            lineToRelative(-1.587f, -1.484f)
            curveToRelative(1.086f, -0.32f, 1.478f, -1.8f, 0.513f, -2.595f)
            lineToRelative(-1.462f, -1.206f)
            curveToRelative(0.65f, -0.571f, 0.747f, -1.68f, -0.057f, -2.314f)
            lineToRelative(-3.309f, -2.61f)
            close()
            moveTo(8.998f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.138f, -0.112f, 0.25f, -0.25f, 0.25f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.138f, 0f, -0.25f, -0.112f, -0.25f, -0.25f)
            verticalLineTo(15f)
            close()
        }
    }.build()
}
