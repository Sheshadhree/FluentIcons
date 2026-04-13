package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideTextTitleCheckmark20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTextTitleCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 4f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(4.707f)
            curveTo(9.072f, 15.523f, 9f, 15.02f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(1.33f, 0f, 2.55f, 0.472f, 3.5f, 1.257f)
            verticalLineTo(6.5f)
            curveTo(18f, 5.12f, 16.88f, 4f, 15.5f, 4f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(6f, 7f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 9f, 5f, 8.552f, 5f, 8f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(13f, 7.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-5.146f, 1.854f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(13.5f, 15.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
