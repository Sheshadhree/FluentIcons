package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CreditCardClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CreditCardClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineToRelative(4.457f)
            curveToRelative(-0.091f, -0.322f, -0.154f, -0.657f, -0.185f, -1f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineTo(9f)
            horizontalLineToRelative(15f)
            verticalLineTo(6.75f)
            curveTo(18f, 5.231f, 16.769f, 4f, 15.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(3f, 6.75f)
            curveTo(3f, 5.784f, 3.784f, 5f, 4.75f, 5f)
            horizontalLineToRelative(10.5f)
            curveTo(16.216f, 5f, 17f, 5.784f, 17f, 6.75f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(16f, 7.75f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveTo(14.5f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(16f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.276f, 14f, 16f, 14f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
