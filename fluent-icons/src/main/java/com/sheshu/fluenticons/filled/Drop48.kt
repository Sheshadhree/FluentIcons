package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Drop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(0.331f, 0f, 0.65f, 0.132f, 0.884f, 0.366f)
            lineTo(25.119f, 4.6f)
            curveToRelative(1.135f, 1.125f, 4.249f, 4.21f, 7.173f, 8.227f)
            curveTo(35.42f, 17.124f, 38.5f, 22.71f, 38.5f, 28.25f)
            curveToRelative(0f, 5.376f, -1.599f, 9.357f, -4.312f, 11.99f)
            curveTo(31.485f, 42.865f, 27.829f, 44f, 24f, 44f)
            curveToRelative(-3.83f, 0f, -7.485f, -1.136f, -10.188f, -3.76f)
            curveTo(11.1f, 37.608f, 9.5f, 33.627f, 9.5f, 28.25f)
            curveToRelative(0f, -5.535f, 3.013f, -11.057f, 6.113f, -15.328f)
            curveToRelative(2.89f, -3.981f, 5.996f, -7.061f, 7.235f, -8.29f)
            lineToRelative(0.268f, -0.266f)
            curveTo(23.351f, 4.132f, 23.67f, 4f, 24f, 4f)
            close()
        }
    }.build()
}
