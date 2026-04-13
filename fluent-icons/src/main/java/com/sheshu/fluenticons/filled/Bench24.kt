package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bench24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bench24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 4f)
            curveTo(4.231f, 4f, 3f, 5.231f, 3f, 6.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(18f)
            verticalLineTo(6.75f)
            curveTo(21f, 5.231f, 19.769f, 4f, 18.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveTo(3f, 13f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            verticalLineToRelative(2.25f)
            curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(17f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 19.664f, 21f, 19.25f)
            verticalLineTo(17f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
