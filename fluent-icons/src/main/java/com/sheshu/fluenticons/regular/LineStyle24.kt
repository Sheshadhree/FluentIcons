package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineStyle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineStyle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 5f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 6.5f, 2.75f, 6.5f)
            horizontalLineToRelative(3.5f)
            curveTo(6.664f, 6.5f, 7f, 6.164f, 7f, 5.75f)
            reflectiveCurveTo(6.664f, 5f, 6.25f, 5f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(7.5f, 0f)
            curveTo(9.836f, 5f, 9.5f, 5.336f, 9.5f, 5.75f)
            reflectiveCurveTo(9.836f, 6.5f, 10.25f, 6.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.164f, 5f, 13.75f, 5f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(7.5f, 0f)
            curveTo(17.336f, 5f, 17f, 5.336f, 17f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
            reflectiveCurveTo(21.664f, 5f, 21.25f, 5f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(3.502f, 6.503f)
            horizontalLineToRelative(-18.5f)
            lineTo(2.651f, 11.51f)
            curveToRelative(-0.366f, 0.05f, -0.649f, 0.363f, -0.649f, 0.743f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(18.5f)
            lineToRelative(0.102f, -0.007f)
            curveToRelative(0.366f, -0.05f, 0.648f, -0.363f, 0.648f, -0.743f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(3.25f, 17f)
            curveTo(2.56f, 17f, 2f, 17.56f, 2f, 18.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(21.44f, 17f, 20.75f, 17f)
            horizontalLineTo(3.25f)
            close()
        }
    }.build()
}
