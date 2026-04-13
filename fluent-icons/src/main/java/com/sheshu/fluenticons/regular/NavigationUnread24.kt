package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NavigationUnread24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NavigationUnread24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.25f, 8.5f)
            curveTo(20.769f, 8.5f, 22f, 7.269f, 22f, 5.75f)
            reflectiveCurveTo(20.769f, 3f, 19.25f, 3f)
            reflectiveCurveTo(16.5f, 4.231f, 16.5f, 5.75f)
            reflectiveCurveToRelative(1.231f, 2.75f, 2.75f, 2.75f)
            close()
            moveToRelative(-3.674f, -1.997f)
            curveTo(15.526f, 6.26f, 15.5f, 6.008f, 15.5f, 5.75f)
            curveToRelative(0f, -0.256f, 0.026f, -0.505f, 0.074f, -0.747f)
            horizontalLineTo(2.752f)
            lineTo(2.65f, 5.01f)
            curveTo(2.284f, 5.06f, 2.002f, 5.374f, 2.002f, 5.753f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(12.824f)
            close()
            moveTo(21.253f, 18f)
            horizontalLineToRelative(-18.5f)
            lineTo(2.65f, 18.007f)
            curveToRelative(-0.366f, 0.05f, -0.648f, 0.363f, -0.648f, 0.743f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(18.5f)
            lineToRelative(0.102f, -0.007f)
            curveToRelative(0.366f, -0.05f, 0.648f, -0.363f, 0.648f, -0.743f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveToRelative(-18.5f, -6.497f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineToRelative(-0.102f, 0.007f)
            horizontalLineToRelative(-18.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineToRelative(0.102f, -0.007f)
            close()
        }
    }.build()
}
