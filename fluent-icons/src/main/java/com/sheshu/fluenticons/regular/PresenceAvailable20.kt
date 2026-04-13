package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceAvailable20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAvailable20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
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
            moveToRelative(12.207f, -3.202f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(9f, 10.586f)
            lineToRelative(3.793f, -3.793f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
        }
    }.build()
}
