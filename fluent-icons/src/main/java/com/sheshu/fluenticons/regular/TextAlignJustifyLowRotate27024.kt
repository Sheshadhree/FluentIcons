package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignJustifyLowRotate27024: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignJustifyLowRotate27024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 11f)
            curveTo(5.336f, 11f, 5f, 10.664f, 5f, 10.25f)
            verticalLineToRelative(-7.5f)
            curveTo(5f, 2.336f, 5.336f, 2f, 5.75f, 2f)
            reflectiveCurveTo(6.5f, 2.336f, 6.5f, 2.75f)
            verticalLineToRelative(7.5f)
            curveTo(6.5f, 10.664f, 6.164f, 11f, 5.75f, 11f)
            close()
            moveToRelative(13f, 11f)
            curveTo(18.336f, 22f, 18f, 21.664f, 18f, 21.25f)
            verticalLineTo(2.75f)
            curveTo(18f, 2.336f, 18.336f, 2f, 18.75f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveTo(11.5f, 10.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(13f, 10.664f, 13f, 10.25f)
            verticalLineToRelative(-7.5f)
            curveTo(13f, 2.336f, 12.664f, 2f, 12.25f, 2f)
            reflectiveCurveTo(11.5f, 2.336f, 11.5f, 2.75f)
            verticalLineToRelative(7.5f)
            close()
        }
    }.build()
}
