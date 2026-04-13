package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextHanging24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextHanging24",
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
            moveToRelative(7f, 13f)
            curveTo(9.336f, 18f, 9f, 18.336f, 9f, 18.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 18f, 21.25f, 18f)
            horizontalLineTo(9.75f)
            close()
            moveTo(9f, 12.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(21.664f, 13f, 21.25f, 13f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 13f, 9f, 12.664f, 9f, 12.25f)
            close()
            moveToRelative(-5.22f, 0.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.47f, 1.47f)
            lineToRelative(-1.47f, 1.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
