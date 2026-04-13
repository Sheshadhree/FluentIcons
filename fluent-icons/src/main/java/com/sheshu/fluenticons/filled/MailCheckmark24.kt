package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailCheckmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailCheckmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 6.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(12f, 9.538f, 12f, 6.5f)
            reflectiveCurveTo(14.462f, 1f, 17.5f, 1f)
            reflectiveCurveTo(23f, 3.462f, 23f, 6.5f)
            close()
            moveToRelative(-2.146f, -2.354f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(16.5f, 7.793f)
            lineToRelative(-1.646f, -1.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(17.5f, 13f)
            curveToRelative(1.747f, 0f, 3.332f, -0.689f, 4.5f, -1.81f)
            verticalLineToRelative(5.56f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineToRelative(9.652f, 5.056f)
            curveToRelative(0.218f, 0.114f, 0.478f, 0.114f, 0.696f, 0f)
            lineToRelative(2.417f, -1.266f)
            curveTo(15.596f, 12.784f, 16.523f, 13f, 17.5f, 13f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineToRelative(6.248f)
            curveTo(11.178f, 4.77f, 11f, 5.614f, 11f, 6.5f)
            curveToRelative(0f, 1.992f, 0.897f, 3.776f, 2.308f, 4.968f)
            lineTo(12f, 12.153f)
            lineToRelative(-9.984f, -5.23f)
            curveToRelative(0.158f, -1.58f, 1.448f, -2.828f, 3.048f, -2.918f)
            lineTo(5.25f, 4f)
            close()
        }
    }.build()
}
