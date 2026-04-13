package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Balloon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Balloon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 1.866f, -0.665f, 3.593f, -1.598f, 4.859f)
            curveToRelative(-0.791f, 1.074f, -1.837f, 1.892f, -2.902f, 2.093f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 17.776f, 15f, 17.5f)
            verticalLineTo(17f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-0.048f)
            curveToRelative(-1.065f, -0.2f, -2.11f, -1.017f, -2.902f, -2.091f)
            curveTo(5.665f, 10.596f, 5f, 8.868f, 5f, 7f)
            close()
            moveToRelative(5.568f, -2.995f)
            curveToRelative(-0.274f, -0.039f, -0.527f, 0.151f, -0.566f, 0.425f)
            curveToRelative(-0.039f, 0.273f, 0.152f, 0.526f, 0.425f, 0.565f)
            curveToRelative(0.814f, 0.116f, 1.459f, 0.76f, 1.575f, 1.574f)
            curveToRelative(0.04f, 0.273f, 0.293f, 0.463f, 0.566f, 0.423f)
            curveToRelative(0.274f, -0.039f, 0.463f, -0.292f, 0.424f, -0.566f)
            curveToRelative(-0.18f, -1.253f, -1.17f, -2.243f, -2.424f, -2.421f)
            close()
        }
    }.build()
}
