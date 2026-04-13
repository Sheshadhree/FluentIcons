package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextWrap24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextWrap24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 5f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 6.5f, 2.75f, 6.5f)
            horizontalLineToRelative(18.5f)
            curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
            reflectiveCurveTo(21.664f, 5f, 21.25f, 5f)
            horizontalLineTo(2.75f)
            close()
            moveToRelative(0f, 6.5f)
            curveTo(2.336f, 11.5f, 2f, 11.836f, 2f, 12.25f)
            reflectiveCurveTo(2.336f, 13f, 2.75f, 13f)
            horizontalLineTo(19f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(20.38f, 18f, 19f, 18f)
            horizontalLineToRelative(-4.44f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-0.72f, -0.72f)
            horizontalLineTo(19f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 18.75f)
            curveTo(2f, 18.336f, 2.336f, 18f, 2.75f, 18f)
            horizontalLineToRelative(6.5f)
            curveTo(9.664f, 18f, 10f, 18.336f, 10f, 18.75f)
            reflectiveCurveTo(9.664f, 19.5f, 9.25f, 19.5f)
            horizontalLineToRelative(-6.5f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            close()
        }
    }.build()
}
