package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Chat48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Chat48",
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
            moveToRelative(12f, -3.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(31.44f, 19f, 30.75f, 19f)
            horizontalLineToRelative(-13.5f)
            curveTo(16.56f, 19f, 16f, 19.56f, 16f, 20.25f)
            close()
            moveToRelative(1.25f, 6.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(16.56f, 29f, 17.25f, 29f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
