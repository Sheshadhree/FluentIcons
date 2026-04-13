package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CreditCardPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CreditCardPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineTo(8f)
            horizontalLineTo(2f)
            verticalLineTo(6.75f)
            close()
            moveTo(2f, 9f)
            horizontalLineToRelative(12.5f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            curveToRelative(0f, 0.773f, 0.293f, 1.478f, 0.773f, 2.01f)
            curveToRelative(-1.107f, 0.1f, -2.006f, 0.921f, -2.223f, 1.99f)
            horizontalLineToRelative(-5.3f)
            curveTo(3.231f, 16f, 2f, 14.769f, 2f, 13.25f)
            verticalLineTo(9f)
            close()
            moveToRelative(14.5f, 3f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(11f, 17.75f, 11f, 16.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
