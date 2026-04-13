package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatEmpty48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatEmpty48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            curveToRelative(-3.45f, 0f, -6.698f, -0.874f, -9.534f, -2.414f)
            lineToRelative(-8.235f, 2.342f)
            curveToRelative(-1.319f, 0.375f, -2.537f, -0.844f, -2.162f, -2.162f)
            lineToRelative(2.343f, -8.238f)
            curveTo(4.873f, 30.695f, 4f, 27.448f, 4f, 24f)
            close()
        }
    }.build()
}
