package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColumnOneSemiNarrow20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneSemiNarrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 5f)
            curveTo(6.336f, 5f, 6f, 5.336f, 6f, 5.75f)
            reflectiveCurveTo(6.336f, 6.5f, 6.75f, 6.5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            reflectiveCurveTo(13.664f, 5f, 13.25f, 5f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            reflectiveCurveTo(6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.664f, 9.5f, 14f, 9.164f, 14f, 8.75f)
            reflectiveCurveTo(13.664f, 8f, 13.25f, 8f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
            close()
            moveTo(6.75f, 14f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 14f, 13.25f, 14f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
