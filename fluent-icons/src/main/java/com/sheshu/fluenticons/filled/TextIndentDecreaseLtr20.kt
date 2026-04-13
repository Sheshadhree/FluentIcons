package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextIndentDecreaseLtr20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentDecreaseLtr20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.75f)
            curveTo(6f, 4.336f, 6.336f, 4f, 6.75f, 4f)
            horizontalLineToRelative(7.5f)
            curveTo(14.664f, 4f, 15f, 4.336f, 15f, 4.75f)
            reflectiveCurveTo(14.664f, 5.5f, 14.25f, 5.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(6.336f, 5.5f, 6f, 5.164f, 6f, 4.75f)
            close()
            moveTo(6.75f, 9f)
            curveTo(6.336f, 9f, 6f, 9.336f, 6f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 9f, 17.25f, 9f)
            horizontalLineTo(6.75f)
            close()
            moveToRelative(0f, 5f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(12.664f, 14f, 12.25f, 14f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(-3.28f, -2.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.56f, 9.75f)
            lineToRelative(0.97f, -0.97f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.5f, 1.5f)
            close()
        }
    }.build()
}
