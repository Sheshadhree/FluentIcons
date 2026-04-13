package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.49f, 7.245f)
            curveTo(24.287f, 6.448f, 25.368f, 6f, 26.495f, 6f)
            horizontalLineToRelative(11.257f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(11.257f)
            curveToRelative(0f, 1.127f, -0.448f, 2.209f, -1.245f, 3.006f)
            lineToRelative(-16.24f, 16.24f)
            curveToRelative(-1.66f, 1.66f, -4.351f, 1.66f, -6.01f, 0f)
            lineTo(7.248f, 29.495f)
            curveToRelative(-1.66f, -1.66f, -1.66f, -4.35f, 0f, -6.01f)
            lineToRelative(16.24f, -16.24f)
            close()
            moveTo(33.5f, 17f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(34.88f, 12f, 33.5f, 12f)
            reflectiveCurveTo(31f, 13.12f, 31f, 14.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
