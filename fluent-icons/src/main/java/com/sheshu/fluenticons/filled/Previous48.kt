package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Previous48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Previous48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 6f)
            curveTo(7.94f, 6f, 8.5f, 6.56f, 8.5f, 7.25f)
            verticalLineToRelative(33.5f)
            curveTo(8.5f, 41.44f, 7.94f, 42f, 7.25f, 42f)
            reflectiveCurveTo(6f, 41.44f, 6f, 40.75f)
            verticalLineTo(7.25f)
            curveTo(6f, 6.56f, 6.56f, 6f, 7.25f, 6f)
            close()
            moveTo(42f, 9.256f)
            curveToRelative(0f, -2.615f, -2.93f, -4.16f, -5.088f, -2.68f)
            lineTo(15.408f, 21.318f)
            curveToRelative(-1.883f, 1.29f, -1.883f, 4.07f, 0f, 5.36f)
            lineToRelative(21.504f, 14.744f)
            curveTo(39.07f, 42.9f, 42f, 41.357f, 42f, 38.743f)
            verticalLineTo(9.255f)
            close()
        }
    }.build()
}
