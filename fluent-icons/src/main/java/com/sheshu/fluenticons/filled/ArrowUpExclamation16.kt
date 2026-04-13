package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpExclamation16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpExclamation16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.707f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 14.776f, 11f, 14.5f)
            verticalLineTo(2.707f)
            lineTo(9.854f, 3.854f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(12f, 2.707f)
            close()
            moveTo(4.5f, 1f)
            curveTo(3.12f, 1f, 2f, 2.12f, 2f, 3.5f)
            curveToRelative(0f, 2.318f, 0.67f, 4.768f, 1.036f, 5.938f)
            curveTo(3.239f, 10.088f, 3.842f, 10.5f, 4.5f, 10.5f)
            curveToRelative(0.658f, 0f, 1.261f, -0.412f, 1.464f, -1.062f)
            curveTo(6.33f, 8.268f, 7f, 5.818f, 7f, 3.5f)
            curveTo(7f, 2.12f, 5.88f, 1f, 4.5f, 1f)
            close()
            moveTo(2.75f, 13.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveTo(5.466f, 15f, 4.5f, 15f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            close()
        }
    }.build()
}
