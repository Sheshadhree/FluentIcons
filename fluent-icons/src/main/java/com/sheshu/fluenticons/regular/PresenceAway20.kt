package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceAway20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAway20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 9.586f)
            verticalLineTo(6.008f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
            lineToRelative(3f, 3f)
            curveToRelative(0.39f, 0.391f, 1.024f, 0.391f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.023f, 0f, -1.414f)
            lineTo(10f, 9.586f)
            close()
            moveTo(0f, 9.996f)
            curveTo(0f, 4.475f, 4.475f, 0f, 9.995f, 0f)
            reflectiveCurveToRelative(9.996f, 4.475f, 9.996f, 9.995f)
            reflectiveCurveToRelative(-4.475f, 9.996f, -9.996f, 9.996f)
            curveTo(4.475f, 19.99f, 0f, 15.516f, 0f, 9.995f)
            close()
            moveTo(9.995f, 2f)
            curveTo(5.58f, 2f, 2f, 5.58f, 2f, 9.995f)
            curveToRelative(0f, 4.416f, 3.58f, 7.996f, 7.995f, 7.996f)
            curveToRelative(4.416f, 0f, 7.996f, -3.58f, 7.996f, -7.996f)
            curveTo(17.99f, 5.58f, 14.41f, 2f, 9.995f, 2f)
            close()
        }
    }.build()
}
