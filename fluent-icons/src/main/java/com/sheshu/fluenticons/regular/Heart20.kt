package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.496f, 16.803f)
            lineToRelative(6.245f, -6.304f)
            curveToRelative(1.684f, -1.71f, 1.679f, -4.474f, -0.017f, -6.187f)
            curveToRelative(-1.663f, -1.68f, -4.328f, -1.723f, -6.026f, -0.121f)
            curveToRelative(-0.037f, 0.034f, -0.073f, 0.07f, -0.109f, 0.106f)
            lineTo(9.993f, 4.9f)
            lineTo(9.388f, 4.29f)
            curveToRelative(-0.033f, -0.034f, -0.066f, -0.067f, -0.1f, -0.099f)
            curveToRelative(-1.702f, -1.614f, -4.372f, -1.59f, -6.027f, 0.083f)
            curveToRelative(-1.688f, 1.705f, -1.68f, 4.476f, 0.016f, 6.189f)
            lineToRelative(6.277f, 6.34f)
            curveToRelative(0.26f, 0.263f, 0.682f, 0.263f, 0.942f, 0f)
            close()
            moveTo(11.3f, 5f)
            curveToRelative(1.296f, -1.309f, 3.402f, -1.308f, 4.713f, 0.016f)
            curveToRelative(1.312f, 1.325f, 1.314f, 3.461f, 0.016f, 4.78f)
            verticalLineToRelative(0.002f)
            lineToRelative(-6.004f, 6.06f)
            lineToRelative(-6.038f, -6.099f)
            curveTo(2.674f, 8.433f, 2.673f, 6.29f, 3.972f, 4.977f)
            curveTo(5.265f, 3.671f, 7.37f, 3.673f, 8.678f, 4.994f)
            lineToRelative(0.96f, 0.97f)
            curveToRelative(0.196f, 0.198f, 0.515f, 0.198f, 0.711f, 0f)
            lineTo(11.3f, 5f)
            close()
        }
    }.build()
}
