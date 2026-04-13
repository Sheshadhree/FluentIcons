package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Balloon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Balloon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.002f, 4.43f)
            curveToRelative(0.04f, -0.274f, 0.292f, -0.464f, 0.566f, -0.425f)
            curveToRelative(1.254f, 0.178f, 2.244f, 1.168f, 2.424f, 2.421f)
            curveToRelative(0.04f, 0.274f, -0.15f, 0.527f, -0.424f, 0.566f)
            curveToRelative(-0.273f, 0.04f, -0.526f, -0.15f, -0.566f, -0.423f)
            curveToRelative(-0.116f, -0.814f, -0.761f, -1.458f, -1.575f, -1.574f)
            curveToRelative(-0.273f, -0.039f, -0.463f, -0.292f, -0.425f, -0.565f)
            close()
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
            moveToRelative(5f, -4f)
            curveTo(7.79f, 3f, 6f, 4.79f, 6f, 7f)
            curveToRelative(0f, 1.637f, 0.585f, 3.16f, 1.402f, 4.268f)
            curveTo(8.238f, 12.399f, 9.232f, 13f, 10f, 13f)
            curveToRelative(0.768f, 0f, 1.763f, -0.602f, 2.598f, -1.734f)
            curveTo(13.415f, 10.156f, 14f, 8.634f, 14f, 7f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
        }
    }.build()
}
