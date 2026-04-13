package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mention12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mention12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(12f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.174f, -0.589f, 1.47f, -0.792f, 1.481f)
                curveTo(9.1f, 7.487f, 8.956f, 7.45f, 8.814f, 7.263f)
                curveTo(8.662f, 7.065f, 8.5f, 6.675f, 8.5f, 6f)
                verticalLineTo(3.75f)
                curveTo(8.5f, 3.336f, 8.164f, 3f, 7.75f, 3f)
                curveTo(7.47f, 3f, 7.226f, 3.153f, 7.098f, 3.38f)
                curveTo(6.707f, 3.14f, 6.25f, 3f, 5.75f, 3f)
                curveTo(4.15f, 3f, 3f, 4.429f, 3f, 6f)
                reflectiveCurveToRelative(1.15f, 3f, 2.75f, 3f)
                curveTo(6.5f, 9f, 7.153f, 8.685f, 7.633f, 8.189f)
                curveToRelative(0.42f, 0.54f, 1.022f, 0.826f, 1.66f, 0.79f)
                curveTo(10.588f, 8.906f, 11.5f, 7.63f, 11.5f, 6f)
                curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveTo(0.5f, 2.962f, 0.5f, 6f)
                reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
                curveToRelative(0.5f, 0f, 0.987f, -0.067f, 1.45f, -0.193f)
                curveToRelative(0.4f, -0.11f, 0.635f, -0.522f, 0.526f, -0.921f)
                curveToRelative(-0.109f, -0.4f, -0.52f, -0.636f, -0.92f, -0.527f)
                curveTo(6.72f, 9.951f, 6.366f, 10f, 6f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveToRelative(5f, 0f)
                curveToRelative(0f, 0.914f, -0.64f, 1.5f, -1.25f, 1.5f)
                reflectiveCurveTo(4.5f, 6.914f, 4.5f, 6f)
                reflectiveCurveToRelative(0.64f, -1.5f, 1.25f, -1.5f)
                reflectiveCurveTo(7f, 5.086f, 7f, 6f)
                close()
            }
        }
    }.build()
}
