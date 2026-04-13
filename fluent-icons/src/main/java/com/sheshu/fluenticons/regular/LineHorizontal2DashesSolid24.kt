package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal2DashesSolid24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal2DashesSolid24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 7f)
            curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
            reflectiveCurveTo(2.336f, 8.5f, 2.75f, 8.5f)
            horizontalLineToRelative(3.5f)
            curveTo(6.664f, 8.5f, 7f, 8.164f, 7f, 7.75f)
            reflectiveCurveTo(6.664f, 7f, 6.25f, 7f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(7.5f, 0f)
            curveTo(9.836f, 7f, 9.5f, 7.336f, 9.5f, 7.75f)
            reflectiveCurveTo(9.836f, 8.5f, 10.25f, 8.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.164f, 7f, 13.75f, 7f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(7.5f, 0f)
            curveTo(17.336f, 7f, 17f, 7.336f, 17f, 7.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveTo(21.664f, 8.5f, 22f, 8.164f, 22f, 7.75f)
            reflectiveCurveTo(21.664f, 7f, 21.25f, 7f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(-15f, 8f)
            curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 15f, 21.25f, 15f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
