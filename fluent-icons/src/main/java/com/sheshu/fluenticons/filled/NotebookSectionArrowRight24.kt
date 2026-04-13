package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NotebookSectionArrowRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NotebookSectionArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.648f, 2.007f)
            lineTo(15.75f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(16.5f, 2.75f)
            verticalLineToRelative(8.327f)
            curveTo(13.385f, 11.557f, 11f, 14.25f, 11f, 17.5f)
            curveToRelative(0f, 0.885f, 0.177f, 1.728f, 0.496f, 2.496f)
            horizontalLineTo(9.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(7f, 5.007f, 8.007f, 4f, 9.25f, 4f)
            lineTo(15f, 3.999f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 17.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            curveToRelative(0f, -3.037f, 2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.463f, 5.5f, 5.5f)
            close()
            moveTo(14.5f, 17f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-1.647f, 1.647f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineTo(19.293f, 17f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}
