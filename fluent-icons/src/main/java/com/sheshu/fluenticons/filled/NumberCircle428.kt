package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle428: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle428",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveToRelative(14.5f, -5.581f)
            curveToRelative(0f, -1.092f, -1.42f, -1.517f, -2.02f, -0.605f)
            lineToRelative(-5.403f, 8.214f)
            curveTo(8.662f, 16.66f, 9.115f, 17.5f, 9.871f, 17.5f)
            horizontalLineToRelative(5.128f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(17.5f)
            horizontalLineTo(17.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.914f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-1f)
            verticalLineTo(8.419f)
            close()
            moveTo(15f, 9.755f)
            verticalLineTo(16f)
            horizontalLineToRelative(-4.11f)
            lineTo(15f, 9.755f)
            close()
        }
    }.build()
}
