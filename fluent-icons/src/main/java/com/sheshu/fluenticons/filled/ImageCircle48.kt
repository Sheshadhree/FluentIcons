package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(37.096f, 39.116f)
            curveTo(33.587f, 42.16f, 29.01f, 44f, 24f, 44f)
            reflectiveCurveToRelative(-9.587f, -1.841f, -13.096f, -4.884f)
            lineToRelative(12.39f, -12.325f)
            curveToRelative(0.39f, -0.388f, 1.021f, -0.388f, 1.411f, 0f)
            lineToRelative(12.391f, 12.325f)
            close()
            moveToRelative(1.784f, -1.752f)
            lineTo(26.468f, 25.02f)
            curveToRelative(-1.365f, -1.358f, -3.571f, -1.358f, -4.936f, 0f)
            lineTo(9.12f, 37.364f)
            curveTo(5.937f, 33.822f, 4f, 29.137f, 4f, 24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            curveToRelative(0f, 5.137f, -1.937f, 9.822f, -5.12f, 13.364f)
            close()
            moveTo(35f, 17f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            close()
        }
    }.build()
}
