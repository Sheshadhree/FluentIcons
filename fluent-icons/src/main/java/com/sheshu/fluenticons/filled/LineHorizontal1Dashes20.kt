package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal1Dashes20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal1Dashes20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 9.75f)
            curveTo(2f, 9.336f, 2.336f, 9f, 2.75f, 9f)
            horizontalLineToRelative(2.5f)
            curveTo(5.664f, 9f, 6f, 9.336f, 6f, 9.75f)
            reflectiveCurveTo(5.664f, 10.5f, 5.25f, 10.5f)
            horizontalLineToRelative(-2.5f)
            curveTo(2.336f, 10.5f, 2f, 10.164f, 2f, 9.75f)
            close()
            moveToRelative(6f, 0f)
            curveTo(8f, 9.336f, 8.336f, 9f, 8.75f, 9f)
            horizontalLineToRelative(2.5f)
            curveTo(11.664f, 9f, 12f, 9.336f, 12f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.336f, 10.5f, 8f, 10.164f, 8f, 9.75f)
            close()
            moveToRelative(6f, 0f)
            curveTo(14f, 9.336f, 14.336f, 9f, 14.75f, 9f)
            horizontalLineToRelative(2.5f)
            curveTo(17.664f, 9f, 18f, 9.336f, 18f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
