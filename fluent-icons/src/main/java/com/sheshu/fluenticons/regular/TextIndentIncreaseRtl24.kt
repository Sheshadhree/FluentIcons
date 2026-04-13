package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextIndentIncreaseRtl24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextIndentIncreaseRtl24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 16f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(9f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.664f, 16f, 15.25f, 16f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(15.03f, -6.78f)
            curveToRelative(-0.266f, -0.267f, -0.683f, -0.29f, -0.976f, -0.073f)
            lineTo(20.22f, 9.22f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.267f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineToRelative(0.073f, 0.084f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.683f, 0.073f, -0.976f)
            lineTo(21.28f, 13.22f)
            lineToRelative(-1.47f, -1.47f)
            lineToRelative(1.47f, -1.47f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(3.25f, 11f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(12f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.664f, 11f, 15.25f, 11f)
            horizontalLineToRelative(-12f)
            close()
            moveToRelative(3f, -5f)
            curveTo(5.836f, 6f, 5.5f, 6.336f, 5.5f, 6.75f)
            reflectiveCurveTo(5.836f, 7.5f, 6.25f, 7.5f)
            horizontalLineToRelative(9f)
            curveTo(15.664f, 7.5f, 16f, 7.164f, 16f, 6.75f)
            reflectiveCurveTo(15.664f, 6f, 15.25f, 6f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
