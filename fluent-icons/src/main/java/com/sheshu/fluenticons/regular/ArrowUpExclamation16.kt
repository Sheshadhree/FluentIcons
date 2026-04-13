package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpExclamation16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpExclamation16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 14.5f)
            verticalLineTo(2.707f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineTo(11f, 2.707f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            close()
            moveToRelative(-7.5f, -2f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(4.086f, 14f, 4.5f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(4.914f, 12.5f, 4.5f, 12.5f)
            close()
            moveToRelative(-1.75f, 0.75f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveTo(5.466f, 15f, 4.5f, 15f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            close()
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            reflectiveCurveTo(6f, 2.672f, 6f, 3.5f)
            curveToRelative(0f, 2.161f, -0.631f, 4.493f, -0.99f, 5.64f)
            curveTo(4.944f, 9.35f, 4.743f, 9.5f, 4.5f, 9.5f)
            reflectiveCurveTo(4.056f, 9.35f, 3.99f, 9.14f)
            curveTo(3.631f, 7.993f, 3f, 5.66f, 3f, 3.5f)
            close()
            moveTo(4.5f, 1f)
            curveTo(3.12f, 1f, 2f, 2.12f, 2f, 3.5f)
            curveToRelative(0f, 2.318f, 0.67f, 4.768f, 1.036f, 5.938f)
            curveTo(3.239f, 10.088f, 3.842f, 10.5f, 4.5f, 10.5f)
            curveToRelative(0.658f, 0f, 1.261f, -0.412f, 1.464f, -1.062f)
            curveTo(6.33f, 8.268f, 7f, 5.818f, 7f, 3.5f)
            curveTo(7f, 2.12f, 5.88f, 1f, 4.5f, 1f)
            close()
        }
    }.build()
}
