package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOof20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOof20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.697f, 7.702f)
            curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0f, -1.415f)
            curveToRelative(-0.391f, -0.39f, -1.025f, -0.39f, -1.415f, 0.002f)
            lineToRelative(-2.995f, 3f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.022f, 0f, 1.413f)
            lineToRelative(2.995f, 3f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.391f, 1.414f, 0f)
            curveToRelative(0.391f, -0.39f, 0.392f, -1.022f, 0.002f, -1.413f)
            lineToRelative(-1.292f, -1.294f)
            horizontalLineToRelative(3.6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3.6f)
            lineToRelative(1.291f, -1.293f)
            close()
            moveTo(9.995f, 0f)
            curveTo(4.475f, 0f, 0f, 4.475f, 0f, 9.995f)
            reflectiveCurveToRelative(4.475f, 9.996f, 9.995f, 9.996f)
            reflectiveCurveToRelative(9.996f, -4.475f, 9.996f, -9.996f)
            curveTo(19.99f, 4.475f, 15.516f, 0f, 9.995f, 0f)
            close()
            moveTo(2f, 9.995f)
            curveTo(2f, 5.58f, 5.58f, 2f, 9.995f, 2f)
            curveToRelative(4.416f, 0f, 7.996f, 3.58f, 7.996f, 7.995f)
            curveToRelative(0f, 4.416f, -3.58f, 7.996f, -7.996f, 7.996f)
            curveTo(5.58f, 17.99f, 2f, 14.41f, 2f, 9.995f)
            close()
        }
    }.build()
}
