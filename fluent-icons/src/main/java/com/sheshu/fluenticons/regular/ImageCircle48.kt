package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            curveToRelative(0f, 4.45f, 1.66f, 8.51f, 4.395f, 11.599f)
            lineToRelative(10.637f, -10.58f)
            curveToRelative(1.365f, -1.358f, 3.571f, -1.358f, 4.936f, 0f)
            lineToRelative(10.637f, 10.58f)
            curveTo(39.84f, 32.51f, 41.5f, 28.449f, 41.5f, 24f)
            curveToRelative(0f, -9.665f, -7.835f, -17.5f, -17.5f, -17.5f)
            close()
            moveToRelative(11.318f, 30.848f)
            lineTo(24.705f, 26.79f)
            curveToRelative(-0.39f, -0.388f, -1.02f, -0.388f, -1.41f, 0f)
            lineTo(12.682f, 37.348f)
            curveTo(15.733f, 39.938f, 19.684f, 41.5f, 24f, 41.5f)
            reflectiveCurveToRelative(8.267f, -1.562f, 11.318f, -4.152f)
            close()
            moveTo(4f, 24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            close()
            moveToRelative(26.5f, -4.5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            close()
            moveToRelative(0f, 2.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(32.985f, 13f, 30.5f, 13f)
            reflectiveCurveTo(26f, 15.015f, 26f, 17.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
        }
    }.build()
}
