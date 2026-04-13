package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoMultiple48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoMultiple48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.75f, 9f)
            curveToRelative(-3.452f, 0f, -6.25f, 2.798f, -6.25f, 6.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.452f, 2.798f, 6.25f, 6.25f, 6.25f)
            horizontalLineToRelative(12f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-12.5f)
            curveTo(33f, 11.798f, 30.202f, 9f, 26.75f, 9f)
            horizontalLineToRelative(-12f)
            close()
            moveTo(6.5f, 15.25f)
            curveToRelative(0f, -0.172f, 0.005f, -0.343f, 0.016f, -0.512f)
            curveTo(4.989f, 15.878f, 4f, 17.698f, 4f, 19.75f)
            verticalLineToRelative(8f)
            curveTo(4f, 33.687f, 8.813f, 38.5f, 14.75f, 38.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(2.052f, 0f, 3.873f, -0.989f, 5.012f, -2.516f)
            curveToRelative(-0.17f, 0.01f, -0.34f, 0.016f, -0.512f, 0.016f)
            horizontalLineToRelative(-12f)
            curveToRelative(-4.556f, 0f, -8.25f, -3.694f, -8.25f, -8.25f)
            verticalLineToRelative(-12.5f)
            close()
            moveToRelative(37.499f, -0.994f)
            curveToRelative(0f, -2.611f, -2.924f, -4.157f, -5.081f, -2.686f)
            lineToRelative(-3.915f, 2.67f)
            verticalLineToRelative(14.522f)
            lineToRelative(3.915f, 2.67f)
            curveToRelative(2.157f, 1.47f, 5.08f, -0.075f, 5.08f, -2.686f)
            verticalLineToRelative(-14.49f)
            close()
        }
    }.build()
}
