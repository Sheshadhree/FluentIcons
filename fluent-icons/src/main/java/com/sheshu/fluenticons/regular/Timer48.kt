package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Timer48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Timer48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 6.25f)
            curveTo(18f, 5.56f, 18.56f, 5f, 19.25f, 5f)
            horizontalLineToRelative(9.5f)
            curveTo(29.44f, 5f, 30f, 5.56f, 30f, 6.25f)
            reflectiveCurveTo(29.44f, 7.5f, 28.75f, 7.5f)
            horizontalLineToRelative(-9.5f)
            curveTo(18.56f, 7.5f, 18f, 6.94f, 18f, 6.25f)
            close()
            moveToRelative(4.75f, 20.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(9.5f)
            close()
            moveTo(24f, 10f)
            curveToRelative(-9.389f, 0f, -17f, 7.611f, -17f, 17f)
            reflectiveCurveToRelative(7.611f, 17f, 17f, 17f)
            reflectiveCurveToRelative(17f, -7.611f, 17f, -17f)
            reflectiveCurveToRelative(-7.611f, -17f, -17f, -17f)
            close()
            moveTo(9.5f, 27f)
            curveToRelative(0f, -8.008f, 6.492f, -14.5f, 14.5f, -14.5f)
            reflectiveCurveTo(38.5f, 18.992f, 38.5f, 27f)
            reflectiveCurveTo(32.008f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(9.5f, 35.008f, 9.5f, 27f)
            close()
            moveToRelative(28.635f, -16.635f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            curveToRelative(-0.488f, 0.489f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-2.5f, -2.5f)
            close()
        }
    }.build()
}
