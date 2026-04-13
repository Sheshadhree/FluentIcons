package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClipMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9f)
            curveTo(19f, 4.455f, 17.545f, 3f, 15.75f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveTo(8f, 13.25f)
            verticalLineTo(7.751f)
            curveToRelative(0f, -0.591f, 0.655f, -0.95f, 1.155f, -0.63f)
            lineToRelative(4.618f, 2.959f)
            curveToRelative(0.307f, 0.196f, 0.307f, 0.645f, 0f, 0.842f)
            lineTo(9.155f, 13.88f)
            curveTo(8.655f, 14.2f, 8f, 13.842f, 8f, 13.249f)
            close()
            moveTo(7.75f, 21f)
            curveToRelative(-1.15f, 0f, -2.162f, -0.598f, -2.74f, -1.5f)
            horizontalLineToRelative(11.24f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.01f)
            curveToRelative(0.902f, 0.578f, 1.5f, 1.59f, 1.5f, 2.74f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
