package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Warning12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Warning12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.214f, 1.459f)
            curveToRelative(0.349f, -0.612f, 1.223f, -0.612f, 1.572f, 0f)
            lineToRelative(4.092f, 7.169f)
            curveTo(11.226f, 9.238f, 10.789f, 10f, 10.09f, 10f)
            horizontalLineTo(1.91f)
            curveToRelative(-0.7f, 0f, -1.136f, -0.762f, -0.788f, -1.372f)
            lineToRelative(4.092f, -7.17f)
            close()
            moveTo(5.5f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(5.5f, 5.776f, 5.724f, 6f, 6f, 6f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            curveTo(6.5f, 4.224f, 6.276f, 4f, 6f, 4f)
            reflectiveCurveTo(5.5f, 4.224f, 5.5f, 4.5f)
            close()
            moveTo(6f, 6.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(5.586f, 8.25f, 6f, 8.25f)
            reflectiveCurveTo(6.75f, 7.914f, 6.75f, 7.5f)
            reflectiveCurveTo(6.414f, 6.75f, 6f, 6.75f)
            close()
        }
    }.build()
}
