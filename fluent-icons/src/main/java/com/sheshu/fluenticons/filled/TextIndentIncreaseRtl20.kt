package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextIndentIncreaseRtl20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentIncreaseRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 4.75f)
            curveTo(14f, 4.336f, 13.664f, 4f, 13.25f, 4f)
            horizontalLineToRelative(-7.5f)
            curveTo(5.336f, 4f, 5f, 4.336f, 5f, 4.75f)
            reflectiveCurveTo(5.336f, 5.5f, 5.75f, 5.5f)
            horizontalLineToRelative(7.5f)
            curveTo(13.664f, 5.5f, 14f, 5.164f, 14f, 4.75f)
            close()
            moveTo(13.25f, 9f)
            curveTo(13.664f, 9f, 14f, 9.336f, 14f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.164f, 2f, 9.75f)
            reflectiveCurveTo(2.336f, 9f, 2.75f, 9f)
            horizontalLineToRelative(10.5f)
            close()
            moveToRelative(0f, 5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5.5f)
            curveTo(7.336f, 15.5f, 7f, 15.164f, 7f, 14.75f)
            reflectiveCurveTo(7.336f, 14f, 7.75f, 14f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(3.72f, -6.28f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-0.97f, 0.97f)
            lineToRelative(0.97f, 0.97f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.5f, -1.5f)
            close()
        }
    }.build()
}
