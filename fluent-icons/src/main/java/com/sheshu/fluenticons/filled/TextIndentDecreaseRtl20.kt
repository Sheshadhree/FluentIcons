package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextIndentDecreaseRtl20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentDecreaseRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.25f, 4f)
            curveTo(13.664f, 4f, 14f, 4.336f, 14f, 4.75f)
            reflectiveCurveTo(13.664f, 5.5f, 13.25f, 5.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(5.336f, 5.5f, 5f, 5.164f, 5f, 4.75f)
            reflectiveCurveTo(5.336f, 4f, 5.75f, 4f)
            horizontalLineToRelative(7.5f)
            close()
            moveTo(14f, 9.75f)
            curveTo(14f, 9.336f, 13.664f, 9f, 13.25f, 9f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9f, 2f, 9.336f, 2f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            close()
            moveToRelative(0f, 5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-5.5f)
            curveTo(7.336f, 14f, 7f, 14.336f, 7f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            close()
            moveToRelative(1.22f, -7.03f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(0.97f, -0.97f)
            lineToRelative(-0.97f, -0.97f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
