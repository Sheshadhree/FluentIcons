package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 7f)
            curveToRelative(0f, 2.876f, -3.1f, 6.01f, -4.844f, 7.544f)
            curveToRelative(-0.668f, 0.588f, -1.645f, 0.588f, -2.312f, 0f)
            curveTo(5.101f, 13.01f, 2f, 9.876f, 2f, 7f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-3.88f, -1.837f)
            lineToRelative(-2.87f, 2.88f)
            lineToRelative(-1.396f, -1.397f)
            lineToRelative(-0.07f, -0.058f)
            curveTo(5.59f, 6.453f, 5.32f, 6.472f, 5.146f, 6.646f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.75f, 1.75f)
            lineToRelative(0.07f, 0.058f)
            curveTo(7.16f, 9.296f, 7.43f, 9.277f, 7.604f, 9.103f)
            lineToRelative(3.224f, -3.233f)
            lineToRelative(0.058f, -0.07f)
            curveToRelative(0.135f, -0.195f, 0.115f, -0.464f, -0.059f, -0.637f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
        }
    }.build()
}
