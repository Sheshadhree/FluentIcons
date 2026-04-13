package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Record48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Record48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 37f)
            curveToRelative(7.18f, 0f, 13f, -5.82f, 13f, -13f)
            reflectiveCurveToRelative(-5.82f, -13f, -13f, -13f)
            reflectiveCurveToRelative(-13f, 5.82f, -13f, 13f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            close()
            moveToRelative(0f, -33f)
            curveTo(12.954f, 4f, 4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            close()
            moveTo(6.5f, 24f)
            curveToRelative(0f, -9.665f, 7.835f, -17.5f, 17.5f, -17.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(6.5f, 33.665f, 6.5f, 24f)
            close()
        }
    }.build()
}
