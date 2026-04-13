package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignJustifyLow24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignJustifyLow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 5.75f)
            curveTo(13f, 5.336f, 13.336f, 5f, 13.75f, 5f)
            horizontalLineToRelative(7.5f)
            curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
            reflectiveCurveTo(21.664f, 6.5f, 21.25f, 6.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(13.336f, 6.5f, 13f, 6.164f, 13f, 5.75f)
            close()
            moveToRelative(-11f, 13f)
            curveTo(2f, 18.336f, 2.336f, 18f, 2.75f, 18f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            close()
            moveToRelative(11.75f, -7.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(13.336f, 13f, 13.75f, 13f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
