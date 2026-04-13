package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clover24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clover24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 2f)
            curveTo(4.127f, 2f, 2f, 4.127f, 2f, 6.75f)
            reflectiveCurveToRelative(2.127f, 4.75f, 4.75f, 4.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-4f)
            curveTo(11.5f, 4.127f, 9.373f, 2f, 6.75f, 2f)
            close()
            moveToRelative(0f, 20f)
            curveTo(4.127f, 22f, 2f, 19.873f, 2f, 17.25f)
            reflectiveCurveToRelative(2.127f, -4.75f, 4.75f, -4.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            close()
            moveToRelative(10.5f, -20f)
            curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
            reflectiveCurveToRelative(-2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-4f)
            curveTo(12.5f, 4.127f, 14.627f, 2f, 17.25f, 2f)
            close()
            moveToRelative(0f, 20f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveToRelative(-2.127f, -4.75f, -4.75f, -4.75f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            close()
        }
    }.build()
}
