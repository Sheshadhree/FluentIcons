package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPlayPause24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPlayPause24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7.75f)
            curveTo(12f, 6.784f, 12.784f, 6f, 13.75f, 6f)
            horizontalLineToRelative(1.5f)
            curveTo(16.216f, 6f, 17f, 6.784f, 17f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-1.5f)
            curveTo(12.784f, 18f, 12f, 17.216f, 12f, 16.25f)
            verticalLineToRelative(-4.13f)
            curveToRelative(-0.024f, 0.55f, -0.304f, 1.092f, -0.84f, 1.417f)
            lineToRelative(-6.5f, 3.952f)
            curveTo(3.493f, 18.197f, 2f, 17.358f, 2f, 15.993f)
            verticalLineTo(8.004f)
            curveToRelative(0f, -1.372f, 1.507f, -2.21f, 2.673f, -1.486f)
            lineToRelative(6.502f, 4.037f)
            curveToRelative(0.526f, 0.327f, 0.8f, 0.862f, 0.825f, 1.408f)
            verticalLineTo(7.75f)
            close()
            moveToRelative(6f, 0f)
            curveTo(18f, 6.784f, 18.784f, 6f, 19.75f, 6f)
            horizontalLineToRelative(1.5f)
            curveTo(22.216f, 6f, 23f, 6.784f, 23f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-1.5f)
            curveTo(18.784f, 18f, 18f, 17.216f, 18f, 16.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
