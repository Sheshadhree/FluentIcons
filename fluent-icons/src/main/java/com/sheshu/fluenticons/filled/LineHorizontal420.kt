package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 3f, 18f, 3.336f, 18f, 3.75f)
            reflectiveCurveTo(17.664f, 4.5f, 17.25f, 4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 7f, 18f, 7.336f, 18f, 7.75f)
            reflectiveCurveTo(17.664f, 8.5f, 17.25f, 8.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
            close()
            moveTo(2.75f, 11f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 11f, 17.25f, 11f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 15.75f)
            curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 16.5f, 2f, 16.164f, 2f, 15.75f)
            close()
        }
    }.build()
}
