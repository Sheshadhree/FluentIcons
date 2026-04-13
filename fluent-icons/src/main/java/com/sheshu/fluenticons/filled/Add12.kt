package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Add12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Add12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.75f)
            horizontalLineTo(9.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(9.914f, 6.75f, 9.5f, 6.75f)
            horizontalLineTo(6.75f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(5.25f, 9.914f, 5.25f, 9.5f)
            verticalLineTo(6.75f)
            horizontalLineTo(2.5f)
            curveTo(2.086f, 6.75f, 1.75f, 6.414f, 1.75f, 6f)
            reflectiveCurveTo(2.086f, 5.25f, 2.5f, 5.25f)
            horizontalLineToRelative(2.75f)
            verticalLineTo(2.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
